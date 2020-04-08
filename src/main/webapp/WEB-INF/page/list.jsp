<%--
  Created by IntelliJ IDEA.
  User: wx
  Date: 2017/12/7
  Time: 17:09
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
    <script src="<c:url value="/resources/js/jquery-3.3.1.js" />"></script>
    <style type="text/css">
    td{padding:5px;}

</style>
</head>
<body>
<div style="padding-left: 10px;">
    <div class="panel panel-default">
        <div class="panel-heading" style="font-size: 18px;">用户信息</div>
        <table class="table" style="text-align: center;" id="tab">
            <thead>
            <tr><td colspan="4" ><button value="xz">新增</button> </td><td colspan="3"><button value="cx">查询 </button></td></tr>
            <tr style="text-align:center; ">
                <th style="width: 45px;">编号</th>
                <th style="width: 75px;">用户名</th>
                <th style="width: 75px;">密码</th>
                <th style="width: 145px;">真实姓名</th>
                <th style="width: 45px;">性别</th>
                <th style="width: 145px;">邮件</th>
                <th style="width: 145px;">联系电话1</th>
            </tr>
            </thead>
            <tbody>
            <c:forEach var="user" items="${tUser}">
            <tr>
                <td>${user.id}</td>
                <td>${user.username}</td>
                <td>${user.password }</td>
                <td>${user.truename }</td>
                <td>${user.sex }</td>
                <td>${user.email }</td>
                <td>${user.phone }</td>
                <td><button value='sc'>删除</button></td>
                <td><button value='bj'>编辑</button></td>
            </tr>
            </c:forEach>

            </tbody>
        </table>
    </div>
</div>
</body>
<script>



    $(function () {
        $("#tab").on("click","button",function () {

            //  console.log(this.parentNode.parentNode)


            //      console.log(this.value)

            if(this.value=="xz"){
                $("#tab").append("    <tr style=\"text-align:center; \">\n" +
                    "                <td style=\"width: 45px;\"><input value='' /> </td>\n" +
                    "                <td style=\"width: 75px;\"><input value='' /></td>\n" +
                    "                <td style=\"width: 75px;\"><input value='' /></td>\n" +
                    "                <td style=\"width: 145px;\"><input value='' /></td>\n" +
                    "                <td style=\"width: 45px;\"><input value='' /></td>\n" +
                    "                <td style=\"width: 145px;\"><input value='' /></td>\n" +
                    "                <td style=\"width: 145px;\"><input value='' /></td>\n   <td><button value='sc'>删除</button></td>\n" +
                    "                <td><button value='bc'>保存</button></td>" +
                    "            </tr>")
            }

            if(this.value=="cx"){


            }

            if(this.value=="bj"){




                console.log($(this.parentNode.parentNode))

                $(this.parentNode.parentNode).find("td").each(function(){



                    if($(this).text() != "删除" && $(this).text() != "编辑"){


                        var val=$(this).text();

                        $(this).text("");
                        console.log($(this).append('<input  value= "'+val+'" />'))

                    }

                    if($(this).text() == "编辑"){

                        var val=$(this).text();

                        $(this).text("");
                        console.log($(this).append('<button value="bc">保存</button>'))
                    }






                })



                // $("#tab").append("<td><button value='bj'>编辑</button></td>")



            }
            if(this.value=="sc"){
                console.log($(this.parentNode.parentNode).empty());
            }


            if(this.value=="bc"){

                $(this.parentNode.parentNode).find("td").each(function(){



                    if($(this).text() != "删除" && $(this).text() != "保存"){


                        var val=$(this).text();
                        console.log(val);
                        console.log(this);
                        $(this).text("21312");
                        //	console.log($(this).append('1321'))

                    }

                    if($(this).text() == "保存"){

                        var val=$(this).text();

                        $(this).text("");
                        console.log($(this).append('<button value="bj">编辑</button>'))
                    }






                })



            }





        })


    })





</script>
</html>
