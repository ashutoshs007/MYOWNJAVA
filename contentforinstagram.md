multilevel inheritence bs multiple inheritence in java



multilevel inheritence 


class A(){

}

class B() extends A{

}

class C() extends B{

}



multiple inheritence  -NOT SUPPORTED BY JAVA DUE TO AMBIGUITY PROBLEM

<!-- class A(){
void show(){
}
}

class B(){
void show(){
}

}

class C() extends A,B{
  C obj=obj = new C();
  obj.show();  //called which show() A one or B one??,ambiguity problem
} -->


<!-- in new version ,they changed it with interface -->
