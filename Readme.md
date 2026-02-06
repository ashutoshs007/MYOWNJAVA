Any line of code that can potentially throw an exception at runtime is called a Critical statement.

Whensoever we have a critical statement ,it is always better to write that critical statement in try catch block



d(){
     __
     __

     try{

     __  (let's say this 3rd line is a critical statement),so we need try catch to handle the excpetion 

     }
     catch{
        _
     }  
}

e(){

     try{

     __  (let's say this 1st line is a critical statement),so we need try catch to handle the excpetion 

     }
     catch{
        _
     }  

     __

     __
}


another way to handle the exception of d() amd e () is to call them in c() method and put try catch there itself

c(){
        __
        __
        __
        try{
        d();
        e();

        catch;
        }
        
}

It is also called Ducking the Exception where d() throws Excpetion and e() throws Exception to the method who is calling it,individually d() and e() do not handles the exception



you can go up the ladder and write try catch block in whatsoever method you want which is calling another method

if main() has try{
        b()
        catch
}

and b has c and c has e and d where e and d are having critical statements then all b,c, d,e throws the Exception c says i want b to handle the exception b says i want main to handle the exception

It is called ducking the excpetion for a particular method

