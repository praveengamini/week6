#include<iostream>
using namespace std;
class AccessSpecifierDemo{
    private: int priVar;
    protected: int proVar;
    public: int pubVar;
    public: void setVar(int priValue,int proValue, int pubValue)
    {
        priVar = priValue;
        proVar = proValue;
        pubVar = pubValue;
    }
    public: void getVar()
    {   
        cout<<"privar:"<<priVar<<" provar:"<<proVar<<" pubvar: "<<pubVar<<endl;

    }
};
int main()
{
    AccessSpecifierDemo obj;
    obj.setVar(1,2,4);
    obj.getVar();
    return  0;
}
