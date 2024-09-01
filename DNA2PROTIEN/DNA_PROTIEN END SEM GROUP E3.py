def transcript(x) :
  l = list(x)  
  for i in range(len(x)):
      if(l[i]=='G'):
          l[i]='C'
      elif(l[i]=='C'):
          l[i]='G'
      elif (l[i] == 'T'):
          l[i] = 'A'
      elif (l[i] == 'A'):
          l[i] = 'U'
      else:
          print('Invalid Input')                      
            
  print("Translated DNA : ",end="")      
  for char in l:
      print(char,end="")
inputfile ="DNA_sequence_original.txt" 
f = open(inputfile, "r")
x = f.read()
  
x = x.replace("\n", "") 
x = x.replace("\r", "")
# function calling
Z =transcript(x)

print("")
rna = input("Enter the RNA sequence: ")



# RNA codon table
rna_codon = {
  "GCA":"A", "GCC":"A", "GCG":"A", "GCU":"A",
  "UGC":"C", "UGU":"C", "GAC":"D", "GAU":"D",
  "GAA":"E", "GAG":"E", "UUC":"F", "UUU":"F",
  "GGA":"G", "GGC":"G", "GGG":"G", "GGU":"G",
  "CAC":"H", "CAU":"H", "AUA":"I", "AUC":"I",
  "AUU":"I", "AAA":"K", "AAG":"K", "UUA":"L",
  "UUG":"L", "CUA":"L", "CUC":"L", "CUG":"L",
  "CUU":"L", "AUG":"M", "AAC":"N", "AAU":"N",
  "CCA":"P", "CCC":"P", "CCG":"P", "CCU":"P",
  "CAA":"Q", "CAG":"Q", "AGA":"R", "AGG":"R",
  "CGA":"R", "CGC":"R", "CGU":"R", "CGG":"R",
  "AGC":"S", "AGU":"S", "UCA":"S", "UCC":"S",
  "UCG":"S", "UCU":"S", "ACA":"T", "ACC":"T",
  "ACG":"T", "ACU":"T", "GUA":"V", "GUC":"V",
  "GUG":"V", "GUU":"V", "UGG":"W", "UAC":"Y",
  "UAU":"Y", "UAG":"!", "UAA":"!", "UGA":"!"
}


protein_string = ""

# Generate protein string
for i in range(0, len(rna)-(3+len(rna)%3), 3):
  protein_string += rna_codon[rna[i:i+3]]
  if (rna_codon[rna[i:i+3]] == "!") :
      break   
# Print the protein string
print ("Protein String: ", protein_string)
