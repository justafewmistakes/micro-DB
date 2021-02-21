package com.microdb.model;

import com.microdb.model.field.Field;

import java.io.Serializable;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * 元组，表中的一行
 * 一行中有多个属性，属性值由{@link Field}的实现类表示
 *
 * @author zhangjw
 * @version 1.0
 */
public class Tuple implements Serializable {
    private static final long serialVersionUID = 3508867799019762862L;

    /**
     * 行中的字段
     */
    private Field[] fields;

    private TableDesc tableDesc;

    public Tuple(TableDesc tableDesc) {
        this.tableDesc = tableDesc;
        this.fields = new Field[tableDesc.getAttributesNum()];
    }

    public TableDesc getTableDesc() {
        return tableDesc;
    }

    public void setTableDesc(TableDesc tableDesc) {
        this.tableDesc = tableDesc;
    }

    public void setField(int index, Field field) {
        fields[index] = field;
    }

    public Field getField(int index) {
        return fields[index];
    }

    public void setFields(Field[] fields) {
        this.fields = fields;
    }

    public List<Field> getFields() {
        return Stream.of(fields).collect(Collectors.toList());
    }
}
