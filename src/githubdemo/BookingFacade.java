/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package githubdemo;


import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

/**
 *
 * @author DeS
 */
public class BookingFacade extends UnicastRemoteObject implements FacadeInterface {
    public void getBookingDetails(){}
    public void setBooking(int booking_Id, String Booking_Type, String booking_date, String booking_Status, String booking_timr){}
    public BookingDTO getbookingDTO(){
        BookingDTO b = null;
        return b;
    }
    
    
    /*
    extends UnicastRemoteObject implements FacadeInterface {

    Course c;
    public CourseFacade() throws RemoteException {
        c= new Course("", "", "");
    }

    @Override
    public void SetCourseData(String title, String code, String Desc)throws RemoteException {
        c.setCode(code);
        c.setDescription(Desc);
        c.setTitle(title);
    }

    @Override
    public String getCouseData() throws RemoteException{
        String CourseData=c.getTitle()+c.getCode()+c.getDescription();
        return CourseData;
    }

    @Override
    public CourseDTO getCourse() throws RemoteException {
        
        CourseDTO dto=new CourseDTO(c.getTitle(), c.getDescription());
        return dto;
    }
    
    
    
    */
}
