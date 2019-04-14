var ajaxUrl = "rest/case/top5/";
var datatableApi;

function updateTable() {
  $.get(ajaxUrl, updateTableByData);
}

$(function () {
  datatableApi = $('#datatable2').DataTable(extendsOpts({
    "columns": [
      {
        "data": "ssoid"
      },
      {
        "data": "ts"
      }
    ],
    "order": [
      [
        1,
        "desc"
      ]
    ]
  }));

});