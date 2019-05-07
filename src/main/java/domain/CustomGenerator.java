package domain;

import org.mybatis.generator.api.IntrospectedColumn;
import org.mybatis.generator.api.IntrospectedTable;
import org.mybatis.generator.api.dom.java.Field;
import org.mybatis.generator.api.dom.java.TopLevelClass;
import org.mybatis.generator.internal.DefaultCommentGenerator;

/**
 * @author : Charles Wei
 * @project : mybatis-generator-maven
 * @company : 浙江桔瓣科技有限公司
 * @date :  2019/4/1
 * Copyright @ 2019 JUBAN Technology Co.Ltd. – Confidential and Proprietary
 */
public class CustomGenerator extends DefaultCommentGenerator {

    @Override
    public void addFieldComment(Field field, IntrospectedTable introspectedTable, IntrospectedColumn introspectedColumn) {
        field.addJavaDocLine("/**");
        field.addJavaDocLine(" * "+introspectedColumn.getRemarks());
        field.addJavaDocLine(" */");
        field.addJavaDocLine(" @Column(name = " +  "\"" + introspectedColumn.getActualColumnName() + "\"" + ")");

        // super.addFieldComment(field, introspectedTable, introspectedColumn);
    }

    @Override
    public void addModelClassComment(TopLevelClass topLevelClass, IntrospectedTable introspectedTable) {

        topLevelClass.addJavaDocLine("import javax.persistence.*;");
        topLevelClass.addJavaDocLine("/**");
        topLevelClass.addJavaDocLine(" *"+introspectedTable.getRemarks());
        topLevelClass.addJavaDocLine(" */");

    }
}
