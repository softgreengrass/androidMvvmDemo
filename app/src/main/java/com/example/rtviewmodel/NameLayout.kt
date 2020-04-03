package com.example.rtviewmodel

import android.content.Context
import android.util.AttributeSet
import android.widget.LinearLayout
import java.time.format.DecimalStyle


/**
 * @ClassName: NameLayout
 * @Description: java类作用描述
 * @Author: outakarayasu
 * @Date: 2020-01-15 18:58
 */
//class NameLayout :LinearLayout {
//
//    constructor(context:Context?):super(context) {
//
//    }
//
//    constructor(context: Context,attributeSet: AttributeSet):super(context,attributeSet) {
//
//    }
//
//    constructor(context: Context,attributeSet:AttributeSet,defStyle:Int):super(context,attributeSet,defStyle) {
//
//    }
//
//}


class NameLayout @JvmOverloads constructor(context: Context, attrs: AttributeSet? = null, defStyleAttr: Int = 0)
    : LinearLayout(context, attrs, defStyleAttr) {
}


//
//class TopImageBtn : LinearLayout {
//    constructor(context: Context?, attrs: AttributeSet?, defStyle: Int) : super(
//        context,
//        attrs,
//        defStyle
//    )
//
//    constructor(context: Context, attrs: AttributeSet?) : super(context, attrs) {
//        val inflater = context
//            .getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
//        inflater.inflate(R.layout.view_topimagebtn, this)
//        val typedArray: TypedArray = context.obtainStyledAttributes(attrs, R.styleable.TopImageBtn)
//        typedArray.recycle()
//    }
//
//    constructor(context: Context?) : super(context) {}
//}