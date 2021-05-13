//
// Created by Bibi on 5/12/2021.
//

#ifndef HEAP_HEAP_H
#define HEAP_HEAP_H
#include <stdlib.h>

typedef struct HEAP{
    int* data;
    int size;
}HEAP;

HEAP * createHeap();
void insert(HEAP*, int);
void printHeap(HEAP*);
#endif //HEAP_HEAP_H
