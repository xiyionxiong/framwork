package com.flyong.pic;

import java.awt.Graphics2D;

public interface Drawer {   
    /**  
     * 在绘画板上绘制字符串  
     *   
     * @param creator 图片创建器对象  
     * @param g 绘画板  
     * @param text 待绘制的字符串  
     */  
    public void draw(AbstractImageCreator creator, Graphics2D g, String text);   
}  
