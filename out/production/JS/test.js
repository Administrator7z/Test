

    window.onload =main;

   //ʵ�ֶԱ�ǩ�м������Խ��а�
    function main(){
	
	   //�Ա�����checkbox��onclick����fun1
       var domArray =  document.getElementsByTagName("input");
	   domArray[0].onclick=fun1;
	   //������������checkbox��onclick����fun2
	   for(var i=1;i<domArray.length;i++){
	       domArray[i].onclick=fun2
	   }
	  //Ϊ���������а�onmouseover��onmouseout
	 domArray = document.getElementsByTagName("tr");
	 for(var i=1;i<domArray.length;i++){
               domArray[i].onmouseover=fun3;
			   domArray[i].onmouseout=fun4;
     }

	}


   //ȫѡ/ȫ��ѡ----ͨ��������checkbox��״̬����������checkbox��״̬
     function fun1(){
	 
	       var domArray =  document.getElementsByTagName("input");
		   var flag = domArray[0].checked;
		   for(var i=1;i<domArray.length;i++){
			     domArray[i].checked=flag;
		   }
	 
	 }
   //ȫѡ/ȫ��ѡ----ͨ��������checkbox��״̬���Ʊ�����checkbox
    function fun2(){
	
	     var domArray =  document.getElementsByTagName("input");
		 //�õ������б�ѡ�е�checkbox�ĸ���
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

	//�����ͣ�������б�����ɫ����Ϊ��ɫ
	function fun3(){
	  this.style.backgroundColor="red"
	}
	//����ƿ��������б�����ɫ����Ϊ��ɫ
	function fun4(){
	  this.style.backgroundColor="white"
	}