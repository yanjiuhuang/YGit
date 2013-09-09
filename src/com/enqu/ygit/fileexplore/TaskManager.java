package com.enqu.ygit.fileexplore;


/**
 * holding one queue for tasks 
 * @author yhuang
 *
 */
public class TaskManager {
	
	
	public enum TaskType{
		FILE_SCAN(0);
		
		private int type;
		private TaskType(int type){
			this.type = type;
		}
		
		public int getType(){
			return type;
		}
	}
}
