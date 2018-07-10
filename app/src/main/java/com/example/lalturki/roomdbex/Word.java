package com.example.lalturki.roomdbex;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;
import android.support.annotation.NonNull;

@Entity(tableName = "word_table")
public class Word {
    @NonNull
    public String getWord() {
        return mWord;
    }

    @PrimaryKey
    @NonNull
    @ColumnInfo(name = "word")
    private String mWord; public Word(String word) {this.mWord = word;}}
