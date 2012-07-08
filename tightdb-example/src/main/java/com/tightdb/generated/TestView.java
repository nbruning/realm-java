/* This file was automatically generated by TightDB. */
package com.tightdb.generated;

import com.tightdb.*;
import com.tightdb.lib.*;

/**
 * This class represents a TightDB view and was automatically generated.
 */
public class TestView extends AbstractView<Test, TestView, TestQuery> {

	public final LongRowsetColumn<Test, TestView, TestQuery> indexInt = new LongRowsetColumn<Test, TestView, TestQuery>(TestTable.TYPES, rowset, 0, "indexInt");
	public final StringRowsetColumn<Test, TestView, TestQuery> second = new StringRowsetColumn<Test, TestView, TestQuery>(TestTable.TYPES, rowset, 1, "second");
	public final LongRowsetColumn<Test, TestView, TestQuery> byteInt = new LongRowsetColumn<Test, TestView, TestQuery>(TestTable.TYPES, rowset, 2, "byteInt");
	public final LongRowsetColumn<Test, TestView, TestQuery> smallInt = new LongRowsetColumn<Test, TestView, TestQuery>(TestTable.TYPES, rowset, 3, "smallInt");
	public final LongRowsetColumn<Test, TestView, TestQuery> longInt = new LongRowsetColumn<Test, TestView, TestQuery>(TestTable.TYPES, rowset, 4, "longInt");
	public TestView(TableViewBase viewBase) {
		super(TestTable.TYPES, viewBase);
	}

}
