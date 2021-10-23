public static String dayOfWeek(int dayNum)
    {
        switch(dayNum)
        {
            Scanner sc = new Scanner(System.in);
                System.out.print("Enter a day number: ");
                int dayNum = sc.nextInt();
                String result = dayOfWeek(dayNum);
                System.out.println(result);
        }
        {
            case 1: return "Sunday";                  
            case 2: return "Monday";                    
            case 3: return "Tuesday";                    
            case 4: return "Wednesday";                    
            case 5: return "Thursday";                    
            case 6: return "Friday";                    
            case 7: return "Saturday";                    
            default: return "Invalid";                    
        }           
    }