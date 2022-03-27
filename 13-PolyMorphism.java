Polymorphism
- single interface(public method) multiple    methods
- single name multi implementations


e.g  AirPlane



before fly. AirPlane should be tested properly
.............................
C++ Syntax
.............................
class AirPlane{
public:
 virtual void engine()=0;
 virtual void landingGear()=0;
 virtual void wings()=0;
};  
class Boeing777:public AirPlane{
public:
void engine(){cout<<"Boeing777 engine start"<<endl;}
void landingGear()
{cout<<"Boeing777 landingear tested"<<endl; }
 void wings()
{cout<<"Boeing777 wings tested"<<endl;}
};

class AirBus:public AirPlane{
public:
void engine(){cout<<"AirBus engine start"<<endl;}
void landingGear()
{cout<<"AirBus landingear tested"<<endl; }
 void wings()
{cout<<"AirBus wings tested"<<endl;}

};


bool testingPlane(AirPlane *a){
  a->engine();//polymorphic call
  a->landingGear();
 a->wings();
 return true;
}


void main() {
AirBus air;
testingPlane(&air);
Boeing777 boeing;
testingPlane(&boeing);
}

..................................................
e.g Remote Control (Generic)

Single remote control can used to start TV as well as Ac.
Also this remote can be used to stop both (Tv & AC)

class RemoteControl{
public:
virtual void start()=0;
virtual void stop()=0;
};
class TV:public RemoteControl{
public:
 void start(){cout<<"TV start"<<endl;}
void stop(){cout<<"TV stop"<<endl;}
};
class AC:public RemoteControl{
public:
 void start(){cout<<"AC start"<<endl;}
void stop(){cout<<"AC stop"<<endl;}
};

void main () {
TV tv;
AC ac;
RemoteControl *rc;
rc=&tv;
rc->start();
rc=&ac;
rc->start();
}

................................................

vehicle *showRoom[10];
Car c1;
showRoom[0]=&c1;
Bike b1;
showRoom[1]=&b1;
...................................................
.............................
Java  Syntax
.............................
interface AirPlane{
public void engine();
public void landingGear();
public void wings();
};  

class Boeing777 implements  AirPlane{
public void engine(){
System.out.println("Boeing777 engine start");}

public void landingGear()
{System.out.println("Boeing777 landingear tested"); }
public void wings(){
  System.out.println("Boeing777 wings tested");}
}



class AirBus implements  AirPlane{
public void engine(){
System.out.println("AirBus engine start");}
public void landingGear()
{System.out.println("AirBus landingear tested"); }
public void wings()
{System.out.println("AirBus wings tested");}

}
class PlaneTest{
static boolean testingPlane(AirPlane a){
      a.engine();//polymorphic call
      a.landingGear();
      a.wings();
      return true;
}
}
class Test {
public static void main(String o[]) {
AirBus air= new AirBus();
PlaneTest.testingPlane(air);
Boeing777 boeing=new Boeing777();
PlaneTest.testingPlane(boeing);
}
}

..................................................
e.g Remote Control (Generic)

Single remote control can used to start TV as well as Ac.
Also this remote can be used to stop both (Tv & AC)

class RemoteControl{
public:
virtual void start()=0;
virtual void stop()=0;
};
class TV:public RemoteControl{
public:
 void start(){cout<<"TV start"<<endl;}
void stop(){cout<<"TV stop"<<endl;}
};
class AC:public RemoteControl{
public:
 void start(){cout<<"AC start"<<endl;}
void stop(){cout<<"AC stop"<<endl;}
};

void main () {
TV tv;
AC ac;
RemoteControl *rc;
rc=&tv;
rc->start();
rc=&ac;
rc->start();
}



