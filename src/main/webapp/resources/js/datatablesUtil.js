function updateTable() {
  $.get(ajaxUrl, updateTableByData);
}

// http://api.jquery.com/jQuery.ajax/#using-converters
/*$.ajaxSetup({
    converters: {
        "text json": function (stringData) {
            var json = JSON.parse(stringData);
            $(json).each(function () {
                this.dateTime = this.dateTime.replace('T', ' ').substr(0, 16);
            });
            return json;
        }
    }
});*/

function extendsOpts(opts) {
  $.extend(true, opts,
      {
        "ajax": {
          "url": ajaxUrl,
          "dataSrc": ""
        },
        "paging": true,
        "info": true
      }
  );
  return opts;
}