var ajaxUrl = "rest/case/lasthour/";
var datatableApi;

function updateTable() {
    $.get(ajaxUrl, updateTableByData);
}

$(function () {
    datatableApi = $('#datatable').DataTable(extendsOpts({
        "columns": [
            {
                "data": "ssoid"
            },
            {
                "data": "ts"
            },/*
            {
                "data": "grp"
            },
            {
                "data": "type"
            },
            {
                "data": "subtype"
            },
            {
                "data": "url"
            },
            {
                "data": "orgid"
            }*/
            {
                "data": "formid"
            }/*,
            {
                "data": "code"
            },
            {
                "data": "ltpa"
            },
            {
                "data": "sudirresponse"
            },
            {
                "data": "ymdh"
            }*/
        ],
        "order": [
            [
                1,
                "asc"
            ]
        ]
    }));

});