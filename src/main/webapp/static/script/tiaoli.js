var arrTitleOffset = [];   //数组保存各个锚点高度
var theLastOffsetTop; //锚点最大高度
var firstOffsetTop; //为了不限制下标值是以0开始的第一个高度
var titles = $("#ctn-content h2,#ctn-content h3,#ctn-content h4");
var H = $('#floatTag').offset().top; //滚动词条隐藏的高度
// 实现内容与目录同步的变量
var isSelected = false; //右下被选中的参数
var checkSelected = false; //时刻检测选中的参数
var numA = titles.length; //所有锚点的个数
var jpTop = parseInt(0); //滚动条里面的div的高度
var checkShowScroll = false;

function resetArgs() {
    theLastOffsetTop = $("#footer").offset().top - 10; //最大高度
    firstOffsetTop = titles.eq(0).offset().top;
    //提取页面各个锚点的高度，并且以锚点的值为下标
    titles.each(function(index) {
        arrTitleOffset[index] = $(this).offset().top;
    });
    arrTitleOffset.sort(function(a, b) {
        return a - b;
    });
}

$(function() {
    titles.length > 0 && resetArgs();
    $(window).scroll(function() {

        //滚动条隐藏的位置
        if ($(document).scrollTop() >= H) {
            !$('#ctn-floatNav').is(":visible") && $('#ctn-floatNav').show();
        } else {
            $('#ctn-floatNav').is(":visible") && $('#ctn-floatNav').hide();
        }
        //滚动条停留的位置
        if ($(document).height() - ($(window).height() + $(document).scrollTop()) <= 353) {
            $('#ctn-floatNav').css('bottom', 353 - ($(document).height() - ($(window).height() + $(document).scrollTop())));
        } else {
            $('#ctn-floatNav').css('bottom', 0);
        }
        // 如果没有标题，则不执行初始化
        if (titles.length < 1) {
            $(".tl-float-bar").css("height","123px");
            return;
        }

        //去除所有选中的状态，防止拖动过快没有去除选中的状态、
        if ($(document).scrollTop() < firstOffsetTop) {
            $(".s-ml-k div.s-on").removeClass("s-on");
            //随便给个足够大的随机数
            isSelected = '10000000000000000';
        } else if ($(document).scrollTop() > theLastOffsetTop) {
            $(".s-ml-k div.s-on").removeClass("s-on");
            //随便给个足够大的随机数
            isSelected = '10000000000000000';
        } else {
            for (var key in arrTitleOffset) {
                if (key < (numA - 1)) {
                    var nextkey = (key - 0) + 1;
                }
                if (!nextkey) {
                    if ($(document).scrollTop() >= arrTitleOffset[key] && $(document).scrollTop() < theLastOffsetTop) {
                        checkSelected = key;
                        break;
                    }

                } else {
                    if ($(document).scrollTop() >= arrTitleOffset[key] && $(document).scrollTop() < arrTitleOffset[nextkey]) {
                        checkSelected = key;
                        break;
                    }
                }
                nextkey = '';
            }
            if (checkSelected != isSelected) {
                //更改选中状态
                $(".s-ml-k div.s-zj").eq(isSelected).removeClass("s-on");
                var it = $(".s-ml-k div.s-zj").get(checkSelected);
                $(it).addClass("s-on");
                if (numA > 11) {
                    if (checkSelected <= 5) {
                        $(".jspPane").css("top", 0);
                    }
                    if (checkSelected >= numA - 5) {
                        jpTop = -((numA - 11) * 31);
                        $(".jspPane").css("top", jpTop);
                    }
                    if (checkSelected > 5 && checkSelected < numA - 5) {
                        jpTop = -((checkSelected - 5) * 31);
                        $(".jspPane").css("top", jpTop);
                    }
                }
                isSelected = checkSelected;
            }
        }

        if ($("#ctn-floatNav").css("display") == "block" && checkShowScroll == false) {
            checkShowScroll = true;
            // the element we want to apply the jScrollPane
            var $el = $('.s-ml-k').jScrollPane({
                verticalGutter: -16
            }),
            // the extension functions and options
            extensionPlugin = {
                extPluginOpts: {
                    // speed for the fadeOut animation
                    mouseLeaveFadeSpeed: 500,
                    // scrollbar fades out after hovertimeout_t milliseconds
                    hovertimeout_t: 1000,
                    // if set to false, the scrollbar will be shown on mouseenter and hidden on mouseleave
                    // if set to true, the same will happen, but the scrollbar will be also hidden on mouseenter after "hovertimeout_t" ms
                    // also, it will be shown when we start to scroll and hidden when stopping
                    useTimeout: true,
                    // the extension only applies for devices with width > deviceWidth
                    deviceWidth: 980
                },
                hovertimeout: null, // timeout to hide the scrollbar
                isScrollbarHover: false, // true if the mouse is over the scrollbar
                elementtimeout: null, // avoids showing the scrollbar when moving from inside the element to outside, passing over the scrollbar
                isScrolling: false, // true if scrolling
                addHoverFunc: function() {
                    // run only if the window has a width bigger than deviceWidth
                    if ($(window).width() <= this.extPluginOpts.deviceWidth) return false;

                    var instance = this;

                    // functions to show / hide the scrollbar
                    $.fn.jspmouseenter = $.fn.show;
                    $.fn.jspmouseleave = $.fn.fadeOut;

                    // hide the jScrollPane vertical bar
                    var $vBar = this.getContentPane().siblings('.jspVerticalBar').hide();

                    /*
                    * mouseenter / mouseleave events on the main element
                    * also scrollstart / scrollstop - @James Padolsey : http://james.padolsey.com/javascript/special-scroll-events-for-jquery/
                    */
                    $el.bind('mouseenter.jsp', function() {
                        // show the scrollbar
                        $vBar.stop(true, true).jspmouseenter();
                        if (!instance.extPluginOpts.useTimeout) return false;
                        // hide the scrollbar after hovertimeout_t ms
                        clearTimeout(instance.hovertimeout);
                        instance.hovertimeout = setTimeout(function() {
                            // if scrolling at the moment don't hide it
                            if (!instance.isScrolling)
                                $vBar.stop(true, true).jspmouseleave(instance.extPluginOpts.mouseLeaveFadeSpeed || 0);
                        }, instance.extPluginOpts.hovertimeout_t);
                    }).bind('mouseleave.jsp', function() {
                        // hide the scrollbar
                        if (!instance.extPluginOpts.useTimeout)
                            $vBar.stop(true, true).jspmouseleave(instance.extPluginOpts.mouseLeaveFadeSpeed || 0);
                        else {
                            clearTimeout(instance.elementtimeout);
                            if (!instance.isScrolling)
                                $vBar.stop(true, true).jspmouseleave(instance.extPluginOpts.mouseLeaveFadeSpeed || 0);
                        }
                    });
                    if (this.extPluginOpts.useTimeout) {
                        $el.bind('scrollstart.jsp', function() {
                            // when scrolling show the scrollbar
                            clearTimeout(instance.hovertimeout);
                            instance.isScrolling = true;
                            $vBar.stop(true, true).jspmouseenter();
                        }).bind('scrollstop.jsp', function() {
                            // when stop scrolling hide the scrollbar (if not hovering it at the moment)
                            clearTimeout(instance.hovertimeout);
                            instance.isScrolling = false;
                            instance.hovertimeout = setTimeout(function() {
                                if (!instance.isScrollbarHover)
                                    $vBar.stop(true, true).jspmouseleave(instance.extPluginOpts.mouseLeaveFadeSpeed || 0);
                            }, instance.extPluginOpts.hovertimeout_t);
                        });
                        // wrap the scrollbar
                        // we need this to be able to add the mouseenter / mouseleave events to the scrollbar
                        var $vBarWrapper = $('<div/>').css({
                            position: 'absolute',
                            left: $vBar.css('left'),
                            top: $vBar.css('top'),
                            right: $vBar.css('right'),
                            bottom: $vBar.css('bottom'),
                            width: $vBar.width(),
                            height: $vBar.height()
                        }).bind('mouseenter.jsp', function() {
                            clearTimeout(instance.hovertimeout);
                            clearTimeout(instance.elementtimeout);
                            instance.isScrollbarHover = true;
                            // show the scrollbar after 100 ms.
                            // avoids showing the scrollbar when moving from inside the element to outside, passing over the scrollbar
                            instance.elementtimeout = setTimeout(function() {
                                $vBar.stop(true, true).jspmouseenter();
                            }, 100);
                        }).bind('mouseleave.jsp', function() {
                            // hide the scrollbar after hovertimeout_t
                            clearTimeout(instance.hovertimeout);
                            instance.isScrollbarHover = false;
                            instance.hovertimeout = setTimeout(function() {
                                // if scrolling at the moment don't hide it
                                if (!instance.isScrolling)
                                    $vBar.stop(true, true).jspmouseleave(instance.extPluginOpts.mouseLeaveFadeSpeed || 0);
                            }, instance.extPluginOpts.hovertimeout_t);
                        });
                        $vBar.wrap($vBarWrapper);
                    }
                }
            },
            // the jScrollPane instance
            jspapi = $el.data('jsp');
            // extend the jScollPane by merging
            $.extend(true, jspapi, extensionPlugin);
            jspapi.addHoverFunc();
        }
    });


});



$(function() {
    // 获取登录状态
    common.getLoginStats();
    var floatNavHeight = $("#ctn-floatNav").height();

    // 底部浮动按钮事件绑定
    $(".folat-tim").each(function() {
        var type = $("a", this).attr("class");
        switch (type) {
            // 目录               
            case 'f-ml':
                $(this).click(function() {
                    var ctn = $(".bar-k");
                    if (ctn.is(":visible")) {
                        ctn.hide();
                        $("#ctn-floatNav,.float-nav-wrap").css("height", "auto");
                    } else {
                        ctn.show();
                        $("#ctn-floatNav,.float-nav-wrap").css("height", floatNavHeight + "px");
                    }
                });
                break;
            // 收藏               
            case 'f-sc':
                $(this).click(function() {
                    if (!common.addFavorite()) {
                        alert("添加成功！");
                    } else {
                        alert('您的浏览器不支持此操作，请按Ctrl+D手动加入收藏');
                    }
                });
                break;
            // 分享               
            case 'f-fx':
                $(this).hover(function() {
                    $(this).addClass("fd-on");
                    $(".pf-fx", this).show();
                }, function() {
                    $(this).removeClass("fd-on");
                    $(".pf-fx", this).hide();
                });
                break;
            // 回到顶部               
            case 'f-top':
                $(this).click(function() {
                    $('body,html').animate({
                        scrollTop: 0
                    }, 500);
                });
                break;
        }

    });
    $("#ctn-floatNav .s-zj").click(function() {
        $("#ctn-floatNav .s-on").removeClass("s-on");
        $(this).addClass("s-on");
    });
    var timer = null;
    $(".shortcut").hover(function() {
        $('.tc2').show();
    }, function() {
        timer = window.setTimeout(function() {
            $('.tc2').hide();
        }, 3000);
    });
    $('.tc2').hover(function() {
        if (timer) {
            window.clearTimeout(timer);
        }
    }, function() {
        window.setTimeout(function() {
            $('.tc2').hide();
        }, 500);

    });
    $('#btn_save_v1').click(function() {
        var sd = $("#search_text_v1").val();
        if (sd == '请输入您要搜索的关键字' || sd == '') {
            alert('请输入您要搜索的关键字');
            return;
        }
        sd = encodeURI(sd);
        var arr = new Array(['type', 2], ['key', '' + sd + '']);
        doSearch("http://so.66law.cn/", arr);
    });
    function doSearch(url, val) {
        doPostSearch(url, val, false);
    }
    function doPostSearch(url, val, ispost) {
        var mye = $('#_searchform');
        var item = "";
        for (var i = 0; i < val.length; i++) {
            item += "<input id=\"" + val[i][0] + "\" name=\"" + val[i][0] + "\"  value=\"" + val[i][1] + "\" type=\"text\">";
        }
        if (mye.length == 0) {
            $('body').append('<form action="' + url + '" id="_searchform" style="display:none;" ' + (ispost ? 'method = "post"' : '') + ' target="_blank">' + item + '</form>');

            mye = $('#_searchform');
        }
        else {
            mye.attr("action", url).html(item);
        }
        mye.submit();
    }

});
function hidestr(con, id) {
    if (con == "请输入您要搜索的关键字") {
        document.getElementById(id).value = "";
    }
}
