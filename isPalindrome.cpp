/**
 * Determine whether an integer is a palindrome. Do this without extra space.
*/
/*Hint: reverse half of the number and compare it to the other part*/

#include <stdio.h>

bool isPalindrome(int num) {
    if (num<0 || (num!=10 && num%10==0)) {
        return false;
    }
    int sum = 0;
    while (num>sum) {
        sum = sum*10 + num%10;
        num /= 10;
    }
    return(num == sum)||    //e.g. 123221
        (num==sum/10);      //e.g. 12321
}

int main(void){
    int a[] = {12321, 12345, 123321};
    for (int i=0;i<3;i++){
        printf("%d :", a[i]);
        if (isPalindrome(a[i])){
            printf("true\n");
        } else {
            printf("false\n");
        }
    }

    return 0;    
}
