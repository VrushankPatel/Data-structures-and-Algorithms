import math

def rootsOfEquation(a,b,c):
    discriminant = (b * b) - (4 * a * c)
        
    if discriminant >= 0:         
        root1 = (float) ((-b + math.sqrt(discriminant))/(2*a))
        root2 = (float) ((-b - math.sqrt(discriminant))/(2*a))
        System.out.println(root1 + " & " + root2 + " are roots.")
    else:
        realpart = b/(2*a)
        imaginarypart = (float) ((math.sqrt(-discriminant))/(2*a))
        
        print("Roots are complex and different.")
        print("x1 = " + str(realpart) + " + " + str(imaginarypart) + "i")
        print("x1 = " + str(realpart) + " - " + str(imaginarypart) + "i")

a = float(input())
b = float(input())
c = float(input())


if __name__=="__main__":
    rootsOfEquation(a,b,c)

