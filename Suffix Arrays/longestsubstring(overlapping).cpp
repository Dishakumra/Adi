/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
#include <iostream>
#include<string.h>
using namespace std;
int main()
{
    string input;
    cin>>input;
    char storage[100][100];
    int size=0;
    for(int i=0;i<input.length();i++){
        char temp[100];
        int k=-1;
        for(int j=i;j<input.length();j++){
            k++;
            temp[k]=input[j];
        }
        k++;
        temp[k]='\0';
        strcpy(storage[size],temp);
        size++;
    }
    
    for(int i=0;i<size;i++){
        for(int j=i+1;j<size;j++){
            if(strcmp(storage[i],storage[j])>0){
            char temp[100];
            strcpy(temp,storage[i]);
            strcpy(storage[i],storage[j]);
            strcpy(storage[j],temp);
            }
            
        }
    }
    
    string result;
    int max=0;
    for(int i=0;i<size;i++){
        int j=0;
        int count=0;
        char temp[100];
        int k=0;
        while(j<strlen(storage[i]) && j<strlen(storage[i+1])){
            if(storage[i][j]!=storage[i+1][j])
            break;
            count++;
            temp[k]=storage[i][j];
            k++;
            j++;
        }
        if(count>max){
            max=count;
            if(j==strlen(storage[i]))
            result=storage[i];
            else if(j==strlen(storage[i+1]))
            result=storage[i+1];
            else{
                temp[k]='\0';
                result=temp;
            }
        }
    }
    cout<<result<<endl;
    return 0;
}
