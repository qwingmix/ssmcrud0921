package com.atguigu.crud.dao;

import com.atguigu.crud.bean.Employee;
import com.atguigu.crud.bean.EmployeeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EmployeeMapper {
    long countByExample(EmployeeExample example);

    int deleteByExample(EmployeeExample example);

    int deleteByPrimaryKey(Integer empId);

    int insert(Employee record);

    int insertSelective(Employee record);
    
    
    //����������MBGԭ���Ĳ�ѯ
    List<Employee> selectByExample(EmployeeExample example);
    Employee selectByPrimaryKey(Integer empId);
    
    
    //��������MBGԭ����ѯ����������չ�� ����������ϲ�ѯ��ͬʱ�õ�Ա����Ϣ��Ա���Ĳ�����Ϣ
    List<Employee> selectByExampleWithDept(EmployeeExample example);
    Employee selectByPrimaryKeyWithDept(Integer empId);

    //------------------���ϣ�Ϊ��Ҫ��employeemarpper.xml���Ӻö��д���---------------------------------------------------------
    
    
    
    

    int updateByExampleSelective(@Param("record") Employee record, @Param("example") EmployeeExample example);

    int updateByExample(@Param("record") Employee record, @Param("example") EmployeeExample example);

    int updateByPrimaryKeySelective(Employee record);

    int updateByPrimaryKey(Employee record);
}