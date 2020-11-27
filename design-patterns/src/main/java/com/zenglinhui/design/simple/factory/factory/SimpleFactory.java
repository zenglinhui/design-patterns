package com.zenglinhui.design.simple.factory.factory;

import com.zenglinhui.design.simple.factory.product.Product;
import com.zenglinhui.design.simple.factory.product.impl.ProductA;
import com.zenglinhui.design.simple.factory.product.impl.ProductB;

/**
 * @author zenglh
 * @date 2020/11/27 18:41
 */
public class SimpleFactory {

    public static Product getProductInstance(String productName) {
        if ("A".equals(productName)) {
            return new ProductA();
        } else if ("B".equals(productName)) {
            return new ProductB();
        } else {
            return null;
        }
    }

}
