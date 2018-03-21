/**
 * Given a 32-bit signed integer, reverse digits of an integer.
 */
/*Hint: To get the sign first, then get each decimal digit 
 * by division and  Modulo.
 * What might be tricky is that the inverse number might
 * be overflow
 */

#define INT_MAX 2147483647

int reverse(int x){
    int sign = x<0 ? -1 : 1;
    x = abs(x);
    int res = 0;
    while(x > 0){   //A positive number becomes negative when overflow happens
        if(INT_MAX/10 < res         
            || (INT_MAX - x%10)<res * 10){  //while the last digit causes overflow
            return 0;
        }
        res = res * 10 + x % 10;
        x /= 10;
    }

    return sign * res;
}

int main(void){
    int a[5] = {1123123,-34534,7463847412,-3453234,1230};
    for (int i=0;i<5;i++){
        printf("%d :", a[i]);
        if ((int res = reverse(a[i]))!=0){
            printf("%d\n", res);
        } else {
            printf("Overflows\n");
        }
    }

    return 0;
}