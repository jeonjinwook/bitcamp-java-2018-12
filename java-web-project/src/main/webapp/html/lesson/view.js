var param = location.href.split('?')[1];
if (param) {
  document.querySelector('h1').innerHTML = '수업 조회';
  loadData(param.split('=')[1])
  var el = document.querySelectorAll('.bit-new-item');
  for (e of el) {
    e.style.display = 'none';
  }
} else {
  document.querySelector('h1').innerHTML = '새 수업';
  var el = document.querySelectorAll('.bit-view-item');
  for (e of el) {
    e.style.display = 'none';
  }
}

document.querySelector('#add-btn').onclick = () => {
  var xhr = new XMLHttpRequest()
  xhr.onreadystatechange = function() {
    if (xhr.readyState != 4 || xhr.status != 200)
      return;

    
    var data = JSON.parse(xhr.responseText);
    if (data.status == 'success') {
      location.href = 'index.html'
    } else {
      alert('등록 실패입니다!\n' + data.message)
    }
    console.log(data);
  };
  xhr.open('POST', '../../app/json/lesson/add', true)
  xhr.setRequestHeader('Content-Type', 'application/x-www-form-urlencoded');
  
  var contents = document.querySelector('#contents').value;
  
  xhr.send("contents=" + encodeURIComponent(contents));
};

document.querySelector('#delete-btn').onclick = () => {
  var xhr = new XMLHttpRequest()
  xhr.onreadystatechange = function() {
    if (xhr.readyState != 4 || xhr.status != 200)
      return;

    var data = JSON.parse(xhr.responseText);
    if (data.status == 'success') {
      location.href = 'index.html'
    } else {
      alert('삭제 실패입니다!\n' + data.message)
    }
    console.log(data);
  };
  var no = document.querySelector('#no').value;
  xhr.open('GET', '../../app/json/lesson/delete?no=' + no, true)
  xhr.send();
};

document.querySelector('#update-btn').onclick = () => {
  var xhr = new XMLHttpRequest()
  xhr.onreadystatechange = function() {
    if (xhr.readyState != 4 || xhr.status != 200)
      return;

    
    var data = JSON.parse(xhr.responseText);
    if (data.status == 'success') {
      location.href = 'index.html'
    } else {
      alert('변경 실패입니다!\n' + data.messages)
    }
    console.log(data);
  };
  xhr.open('POST', '../../app/json/lesson/update', true)
  xhr.setRequestHeader('Content-Type', 'application/x-www-form-urlencoded');
  
  var no = document.querySelector('#no').value;
  var contents = document.querySelector('#contents').value;
  
  var qs = "contents=" + encodeURIComponent(contents) +
  '&no=' + no;
  xhr.send(qs);
};

function loadData(no) {
  var xhr = new XMLHttpRequest()
  xhr.onreadystatechange = function() {
    if (xhr.readyState != 4 || xhr.status != 200)
      return;

    var data = JSON.parse(xhr.responseText);
    console.log(data);
    document.querySelector('#no').value = data.no;
    document.querySelector('#title').value = data.title;
    document.querySelector('#startDate').value = data.startDate;
    document.querySelector('#totalHours').value = data.totalHours;
  };
  xhr.open('GET', '../../app/json/lesson/detail?no=' + no, true)
  xhr.send()
}
















