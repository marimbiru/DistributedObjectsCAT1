//package com.ics.demo.mockCAT;
//
//import org.springframework.cloud.openfeign.FeignClient;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.List;
//
//@FeignClient(name = "94622", url = "http://127.0.0.1:9090")
//public interface MockRestClient {
//    @RequestMapping(method= RequestMethod.POST, value = "students")
//    Student registerStudent(@RequestBody Student student);
//
//    @RequestMapping(method = RequestMethod.GET, value="students/")
//    Student findByStudentNumber(@RequestParam Long studentNumber);
//
//    @RequestMapping(method=RequestMethod.GET,value = "lecturers")
//    List<Lecturer> getAllLecturers();
//
//    @RequestMapping(method = RequestMethod.POST, value = "appointments")
//    Appointment createAppointment(@RequestBody Appointment appointment);
//
//    @RequestMapping(method = RequestMethod.PATCH, value ="appointments/{appointmentId}")
//    Appointment confirmAppointment(@RequestParam Long studentId, @PathVariable("appoinmentId") Long appointmentId);
//}
