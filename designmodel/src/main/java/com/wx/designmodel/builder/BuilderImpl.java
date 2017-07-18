package com.wx.designmodel.builder;

/**
 * Created by Administrator on 2017/7/18.
 */
public class BuilderImpl implements Builder {

    private Product product = new Product();

    @Override
    public void buildPart1() {
        product.setPart1("build part1");
    }

    @Override
    public void buildPart2() {
        product.setPart2("build part2");
    }

    @Override
    public Product retrieveResult() {
        return product;
    }
}
