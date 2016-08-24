class dict
{
int count = 0;
        Scanner phraseScan = new Scanner(segment);
        while (phraseScan.hasNext()) {
            String word = phraseScan.next();
            for (int i=0; i<dic.length; i++) {
                if (word.equalsIgnoreCase(dic[i])) count++;
            }
        }

        System.out.println(segment + "\t" + count + " English words");

 
        for (int i=1; i<in.length(); i++) {
            split(head+" "+in.substring(0,i), in.substring(i,in.length()));
        }   
    }

    public static void main (String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scan.next();
        System.out.println();

        Scanner filescan = new Scanner(new File("src:\\dictionary.txt"));
        int wc = 0;
        while (filescan.hasNext()) {
            dic[wc] = filescan.nextLine();
            wc++;
        }

        System.out.println(wc + " words stored");

        split("", input);

    }
}
}
