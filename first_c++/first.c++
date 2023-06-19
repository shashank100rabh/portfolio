#include<iostream>
#include<algorithm>
using namespace std;

int main()
{
    /*int arr[5]={2,4,6,8,10};
    int*p=arr;
    cout<<"address at 0th index"<<p+2 <<endl;
    cout<<"address at 0th index"<<(*p)+2;*/
   /* int arr;//that gives the address of the  array
    int *p=&arr;
    cout<<p;*/
   /* int arr [5]={2,4,6,8,10};
    int*p = &arr[0];
    p=p+2;//address 3rd pointer
    cout<<"1->"<<p<<endl;
    cout<<p[3];*///addreess of 3rd arrey*/
    //now for chracter 
     /* char ch[6]={"abcde"};
    char *p = &ch[1];
    cout<<ch;  */
     int value = 23;
     int*ptr=&value;
     int**d_ptr=&ptr;
     cout<<"address of value--> "<<ptr <<endl;
     cout<<"address of ptr-->"<<d_ptr <<endl;
     cout<<value <<endl;
     cout<< "ptr value by pointer(ptr) --> " <<*ptr<<endl;

        return 0;
}