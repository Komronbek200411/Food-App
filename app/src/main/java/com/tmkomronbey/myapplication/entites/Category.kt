package com.tmkomronbey.myapplication.entites

import androidx.room.*
import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import com.tmkomronbey.myapplication.entites.conventer.CategoryListConverter

@Entity(tableName = "Category")
data class Category(
    @PrimaryKey(autoGenerate = true)
    var id:Int,

    @ColumnInfo(name = "categoryItems")
    @Expose
    @SerializedName("categories")
    @TypeConverters(CategoryListConverter::class)
    var categorieitems: List<CategoryItems>? = null
)


