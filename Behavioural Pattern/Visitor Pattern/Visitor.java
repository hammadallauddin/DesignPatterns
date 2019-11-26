package com.test.hammad;

public interface Visitor {

	public double visit(LiquorItem item);

	public double visit(TobaccoItem item);

	public double visit(NecessityItem item);

}
