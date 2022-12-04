/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package githubdemo;

/**
 *
 * @author DeS
 */
public abstract class BaseHandler implements Handler {
	private Handler next;
        
        @Override
    public void SetNext(Handler nextHandle){
		this.next = nextHandle;

	}

    @Override
    public  void Handle(FeedbackDetails feedback)
            {
		if (next != null) {
			next.Handle(feedback);
		}
            }
}
    
            

