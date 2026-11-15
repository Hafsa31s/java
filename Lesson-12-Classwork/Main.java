class Main {

  public static void main(String[] args) {
    (new Main()).init();
  }
  void print(Object o){ System.out.println(o);}
  void printt(Object o){ System.out.print(o);}

  void init(){
   function collegeCredit(courseCode) {
 if (courseCode.length < 6) {
    return false;
  }
 const sixthLetter = courseCode.charAt(5).toUpperCase();
return sixthLetter === 'E' || sixthLetter === 'M';
}
function getCounselor(officialClass) {
    if (!officialClass || typeof officialClass !== 'string') {
        return "Unknown / Invalid Class";
    }
   const counselorMap = {
        'B': 'Berrouet',
        'C': 'Chu',
        'D': 'Dinn',
        'E': 'Eyzengart',
        'F': 'Flores',
        'G': 'Gibson',
        'L': 'Shim Lee',
        'M': 'Meltzer',
        'P': 'Paccione',
        'S': 'Fiore',
        'T': 'Tsai',
        'Z': 'Zayes'
    };
      const firstChar = officialClass.charAt(0).toUpperCase();
      midIndex = Math.floor(officialClass.length / 2);
    const midChar = officialClass.charAt(midIndex).toUpperCase();
    if (counselorMap[firstChar]) {
        return counselorMap[firstChar];
    } else if (counselorMap[midChar]) {
        return counselorMap[midChar];
  }
console.log(getCounselor("B102")); 
console.log(getCounselor("10C2"));
console.log(getCounselor("99S0"));
console.log(getCounselor("X000")); 
 
}