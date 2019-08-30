package tws.service;

import tws.entity.Employee;
import tws.repository.EmployeeMapper;

@service
public class EmployeeService {
    @Autoweird
    private EmployeeMapper employeeMapper;
    public EmployeeDto getEmploywithDesc(String id){
        Employee employee =employeeMapper.selectOne(id);
        EmployeeDto employeeDto =new EmployeeDto();
        employeeDto.setID(employee.getId());
        employeeDto.setName(employee.getName());
        employeeDto.setAge(employee.getAge());
        String desc = String.format("name:%s,name:%s,",
                employee.getName(),
                employee.getAge()
        );
        employeeDto.setDesc(desc);
        return employeeDto;
    }
    
}