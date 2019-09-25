package com.ics.demo.CATPrac;

import com.ics.demo.CATPrac.models.Attachment;
import com.ics.demo.CATPrac.models.Rejection;
import com.ics.demo.CATPrac.models.Student;
import com.ics.demo.mockCAT.Appointment;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@FeignClient(name="94622", url="http://10.51.10.111:2000")
public interface FeignRestClient {
    @RequestMapping(method= RequestMethod.POST, value="students")
    Student registerStudent(@RequestBody Student student);

    @RequestMapping(method = RequestMethod.POST,value="companies/{companyId}/attachments")
    Attachment requestAttachment(@RequestParam Long studentId, @PathVariable("companyId")Long companyId);

    @RequestMapping(method = RequestMethod.PATCH,value = "companies/{companyId}/attachments")
    Attachment requestDepartment(@RequestParam Long studentId, @RequestParam Long departmentId, @PathVariable("companyId") Long companyId);

    @RequestMapping(method = RequestMethod.DELETE, value = "departments")
    void rejectAppointment(@RequestBody Rejection rejection);

    @RequestMapping(method = RequestMethod.GET ,value="students")
    List<Student> getStudents();
}
