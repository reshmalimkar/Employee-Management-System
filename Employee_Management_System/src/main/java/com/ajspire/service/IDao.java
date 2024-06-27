package com.ajspire.service;


public interface IDao<T , K> {
void add(T t)throws Exception;
T getById(K key) throws Exception;
boolean updateById(K key, String fieldName,String val)throws Exception;
}