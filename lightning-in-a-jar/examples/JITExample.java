public class JITExample{
   private static int iterations = 1;
   private static boolean print = false;
   void main(String[] args) throws Exception{
   	if(args.length > 0 && args[0] != null){
		iterations = Integer.valueOf(args[0]);
	}
   	if(args.length > 1 && args[1] != null){
		print = Boolean.valueOf(args[1]);
	}

    for (int i = 0; i < iterations; i++) {
		long start = System.nanoTime();
        foo(i, i + 1);
		if(i % 100 == 0){
		  bar(i, i + 1);
		}
		long end = System.nanoTime();
		if(print)
		  IO.println(end-start);
    }
   }
   
   private static int foo(int a, int b){
   	 return a+b;
   }

   private static int bar(int x, int y){
   	 return x*y;
   }
}
