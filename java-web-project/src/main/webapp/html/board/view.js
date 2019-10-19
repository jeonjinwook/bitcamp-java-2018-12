var param = location.href.split('?')[1];
if (param) {
  $('h1').html('게시물 조회')
  loadData(param.split('=')[1])
  var el = $('.bit-new-item');
  for (e of el) {
    e.style.display = 'none';
  }
} else {
  $('h1').html = '새 글';
  var el = $('.bit-view-item');
  for (e of el) {
    e.style.display = 'none';
  }
}

$('#add-btn').click((e) => {
  $.post('../../app/json/board/add', 
      {
    contents: $('#contents').val()
      },
      function(data) {
        if(data.status == 'fail') {
          alert('등록 실패입니다!\n' + data.messages)
        } else {
          location.href = 'index.html'
        }
      })
});

$('#delete-btn').click((e) => {
  $.getJSON('../../app/json/board/delete?no=' + $('#no').val(),
      function(data) {
        if(data.status == 'fail'){
          alert('삭제 실패입니다!\n' + data.messages)
        } else {
          location.href = 'index.html'
        }
      })
});

$('#update-btn').click((e) => {
  $.post('../../app/json/board/update',
      {
    no: $('#no').val(),
    contents: $('#contents').val()
      },
      function(data){
        if (data.status == 'fail'){
          alert("변경 실패입니도!\n" + data.messages)
        } else {
          location.href = 'index.html'
        }
      })
});


function loadData(no) {
  $.getJSON('../../app/json/board/detail?no=' + no,
      function(data){
    $('#no').val(data.no),
    $('#contents').val(data.contents),
    $('#createdDate').val(data.createdDate),
    $('#viewCount').val(data.viewCount)
      });
  }

















