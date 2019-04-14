var ajaxUrl = "rest/case/nofinish/";
var datatableApi;

function updateTable() {
  $.get(ajaxUrl, updateTableByData);
}

$(function () {
  datatableApi = $('#datatable1').DataTable(extendsOpts({
    "columns": [
      {
        "data": "ssoid"
      },
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
          "data": "ts"
      }/*,
        {
            "data": "url"
        },
        {
            "data": "orgid"
        },
        {
          "data": "formid"
        },
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
        0,
        "asc"
      ],
      [
        1,
        "asc"
      ],
      [
        2,
        "asc"
      ],
      [
        4,
        "asc"
      ]
    ]
  }));

});