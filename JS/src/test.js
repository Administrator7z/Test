

    window.onload =main;

   //实现对标签中监听属性进行绑定
    function main(){
	
	   //对标题行checkbox绑定onclick关联fun1
       var domArray =  document.getElementsByTagName("input");
	   domArray[0].onclick=fun1;
	   //对数据行所有checkbox绑定onclick关联fun2
	   for(var i=1;i<domArray.length;i++){
	       domArray[i].onclick=fun2
	   }
	  //为所有数据行绑定onmouseover与onmouseout
	 domArray = document.getElementsByTagName("tr");
	 for(var i=1;i<domArray.length;i++){
               domArray[i].onmouseover=fun3;
			   domArray[i].onmouseout=fun4;
     }

	}


   //全选/全不选----通过标题行checkbox的状态控制数据行checkbox的状态
     function fun1(){
	 
	       var domArray =  document.getElementsByTagName("input");
		   var flag = domArray[0].checked;
		   for(var i=1;i<domArray.length;i++){
			     domArray[i].checked=flag;
		   }
	 
	 }
   //全选/全不选----通过数据行checkbox的状态控制标题行checkbox
    function fun2(){
	
	     var domArray =  document.getElementsByTagName("input");
		 //得到数据行被选中的checkbox的个数
		 var checkedNum = 0;
		 for(var i=1;i<domArray.length;i++){
		       if(domArray[i].checked == true){
			     checkedNum++;
			   }
		 }
		 if(checkedNum == domArray.length-1){
		   domArray[0].checked=true;
		 }else{
		   domArray[0].checked=false;
		 }
	
	}

	//鼠标悬停的数据行背景颜色设置为红色
	function fun3(){
	  this.style.backgroundColor="red"
	}
	//鼠标移开的数据行背景颜色设置为白色
	function fun4(){
	  this.style.backgroundColor="white"
	}