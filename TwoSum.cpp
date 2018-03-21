/**
 * Given an array of integers, return indices of the two numbers such that they add up to a specific target.
 * e.g. Given nums = [2, 7, 11, 15], target = 9,Because nums[0] + nums[1] = 2 + 7 = 9,return [0, 1].
*/
/*Hint: There is no other good way except for traversing all combinitions*/

#include <stdio.h>
#include <stdlib.h>

int* twoSum(int* nums, int numsSize, int target){
    int* answer = (int*)malloc(sizeof(int) * 2);
    for (int i=0;i<numsSize;i++){
        for(int j=i+1;j<numsSize;j++){
            if((nums[i] + nums[j])==target){
                answer[0] = i;
                answer[i] = j;                
            }
        }
    }
    return answer;
}

int main(void){
    int nums[4] = {2, 7, 11, 15};
    int numSize = sizeof(nums)/sizeof(int);

    int* answer = twoSum(nums, numSize, 9);
    printf("index1 : %d", answer[0]);
    printf("index2 : %d", answer[1]);
    printf("\n");

    free(answer);
    return 0;
}