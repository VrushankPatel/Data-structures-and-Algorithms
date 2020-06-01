//
//  RootsOfEquation.cpp
//  Data-structures-and-algorithms
//
//  Created by Vrushank Patel on 29/05/20.
//  Copyright © 2020 Vrushank Patel. All rights reserved.
//

/*
 * Write an algorithm to find all roots of a quadratic equation ax2+bx+c=0.
 */

#include <iostream>
#include <cmath>
using namespace std;

int main(){
    float a, b, c, realpart, imaginarypart, discriminant, root1, root2;
    
    cin >> a;
    cin >> b;
    cin >> c;
    
    discriminant = (b * b) - (4 * a * c);
    
    if(discriminant >= 0){
        root1 = (-b + sqrt(discriminant))/(2*a);
        root2 = (-b - sqrt(discriminant))/(2*a);
        
        cout << root1 << " & " << root2 << " are roots." << endl;
    }else{
        realpart = b/(2*a);
        imaginarypart = (sqrt(-discriminant))/(2*a);
        
        cout << "Roots are complex and different."  << endl;
        cout << "x1 = " << realpart << "+" << imaginarypart << "i" << endl;
        cout << "x2 = " << realpart << "-" << imaginarypart << "i" << endl;
    }
}
