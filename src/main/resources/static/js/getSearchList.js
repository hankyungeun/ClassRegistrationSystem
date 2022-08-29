function getSearchList(){
    $.ajax({
        type: 'GET',
        url : "/getSearchList",
        data : $("form[name=search-form]").serialize(),
        success : function(result){
            //테이블 초기화
            $('#boardtable > tbody').empty();
            if(result.length>=1){
                result.forEach(function(item){
                    str='<tr>'
                    str += "<td>"+item.idx+"</td>";
                    str+="<td>"+item.writer+"</td>";
                    str+="<td><a href = '/class/search?classNamex=" + item.idx + "'>" + item.title + "</a></td>";
                    str+="<td>"+item.date+"</td>";
                    str+="<td>"+item.hit+"</td>";
                    str+="</tr>"
                    $('#boardtable').append(str);
                })
            }
        }
    })
}

// function getBoardList() {
//     $.ajax({
//         type: 'GET',
//         url: '/getBoardList',
//         success: function(result) {
//             //들고오면 테이블에 뿌리기
//             //페이징 처리는 다음에 ..
//
//             if(result.length>1){
//                 result.forEach(function(item){
//                     str='<tr>'
//                     str += "<td>"+item.idx+"</td>";
//                     str+="<td>"+item.writer+"</td>";
//                     str+="<td><a href = 'view?idx=" + item.idx + "'>" + item.title + "</a></td>";
//                     str+="<td>"+item.date+"</td>";
//                     str+="<td>"+item.hit+"</td>";
//                     str+="</tr>"
//                     $('#boardtable').append(str);
//
//                 })
//
//             }
//         }
//         ,
//         error: function(result) {
//         },
//         complete: function() {
//         }
//
//     })
// }
