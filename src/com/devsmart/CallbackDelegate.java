package com.devsmart;


import java.util.HashSet;

public class CallbackDelegate<T> {

    public interface Callback<T> {
        void onCallback(T obj);
    }

    private HashSet<Callback<T>> mListeners = new HashSet<Callback<T>>();

    public void registerCallback(Callback<T> l) {
        mListeners.add(l);
    }

    public void unregisterCallback(Callback<T> l) {
        mListeners.remove(l);
    }

    public void emit(T obj) {
        for(Callback<T> l : mListeners){
            l.onCallback(obj);
        }
    }

}
