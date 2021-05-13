//
// Created by Bibi on 5/12/2021.
//

#include <dshow.h>
#include "heap.h"

HEAP *createHeap(){
    HEAP *heap = (HEAP*)malloc(1*sizeof (HEAP));
    if(!heap){
        printf("Hiba a helyfoglalasnal!");
        exit(-1);
    }
    (*heap).size = 1;
    (*heap).data = (int*)malloc(heap->size*sizeof(int));
    if(!heap->data){
        printf("Hiba a data lefoglalasnal!");
        exit(-2);
    }
    return heap;
}

void insert(HEAP *heap , int newData){
    heap->size ++;
    if(heap->size == 0){
        heap->data[0] = newData;
    }else{
        heap->data = (int*)realloc(heap->data, heap->size);
        heap->data[heap->size-1] = newData;

    }
}

void printHeap(HEAP *heap){
    for(int i=0; i<heap->size; ++i){
        printf("%d ", heap->data[i]);
    }
}

void swap(int *a, int*b){
    int v = a;
    a = b;
    b = v;
}

void emel(HEAP * heap, int i){
    while(i>1 && (heap->data[i/2] < heap->data[i]) ){
        swap(i/2, i);
        i = i/2;
    }
}