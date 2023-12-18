#include <stdio.h>
#include <stdbool.h>
#include <stdlib.h>

int solution(int num1, int num2) {
    int answer = 0;

    answer = num1 * num2;

    return answer;
}

int main(){
    int result = solution(4, 6);

    printf("result : %d\n", result);
}
