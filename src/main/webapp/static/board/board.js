$(function() {
  function successFunction(data, status, xhr) {
    console.log(data)
    var html = '' +
      '<header>\n' +
      '        <h1>Board</h1>\n' +
      '    </header>\n' +
      '    <main>' +
      '<ul>\n' +
      '            <li>\n' +
      '                <div>num</div>\n' +
      '                <div>title</div>\n' +
      '                <div>writer</div>\n' +
      '                <div>date</div>\n' +
      '            </li>';
    for(var i = 0, limit = data.length; i < limit; i ++) {
      var board = data[i];

      html += '' +
        '<li>\n' +
        '    <div>'+board.seq+'</div>\n' +
        '    <div>'+board.title+'</div>\n' +
        '    <div>'+board.writer+'</div>\n' +
        '    <div>'+board.createDate+'</div>\n' +
        '</li>'
    }
    html+='</ul>';
    html+='</main>';
    $('#root').append(html)
  }

  $.ajax({
    url: '/api/boards/',
    success: successFunction,
    error: function(xhr, status, error) {
      console.log(error)
    },
  })
})
