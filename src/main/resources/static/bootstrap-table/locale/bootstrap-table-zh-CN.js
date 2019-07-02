/**
 * Bootstrap Table Chinese translation
 * Author: Zhixin Wen<wenzhixin2010@gmail.com>
 */
(function ($) {
    'use strict';

    $.fn.bootstrapTable.locales['zh-CN'] = {
        formatLoadingMessage: function () {
            return '<span data-locale="i18n_Tryingtoloaddatapleasewait">正在努力地加载数据中，请稍候……</span>';
        },
        formatRecordsPerPage: function (pageNumber) {
            return '<span data-locale="i18n_Perpagedisplay">每页显示</span> ' + pageNumber + ' <span data-locale="i18n_Barrecord">条记录';
        },
        formatShowingRows: function (pageFrom, pageTo, totalRows) {
            return '<span data-locale="i18n_Display">显示第 </span>' + pageFrom + '<span data-locale="i18n_Tothefirst"> 到第</span> ' + pageTo + '<span data-locale="i18n_Recordtotal"> 条记录，总共</span> ' + totalRows + ' <span data-locale="i18n_Barrecord">条记录</span>';
        },
        formatSearch: function () {
            return '';//<span data-locale="i18n_search"></span>
        },
        formatNoMatches: function () {
            return '<span data-locale="i18n_Nomatchingrecordwasfound">没有找到匹配的记录</span>';
        },
        formatPaginationSwitch: function () {
            return '<span data-locale="i18n_Hidedisplaypaging">隐藏/显示分页</span>';
        },
        formatRefresh: function () {
            return '';//<span data-locale="i18n_serach">切换</span>
        },
        formatToggle: function () {
            return '';//<span data-locale="i18n_switch">切换</span>
        },
        formatColumns: function () {
            return '';//<span data-locale="i18n_column">列</span>
        }
    };

    $.extend($.fn.bootstrapTable.defaults, $.fn.bootstrapTable.locales['zh-CN']);

})(jQuery);