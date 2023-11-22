var secretNumber=parseInt(Math.random() *(1001 - 1) + 1);
var cont=0;
do{
  if(cont != 0){
      alert('Você já fez ' + cont + ' tentativas!')
    }
  var attempt=prompt('Insert a number between 1 and 1000 to attempt');
  cont++;
  if(attempt==secretNumber){
    alert('You win, you got the number right!!, with only '+cont+' attemps');
    
  }else if(attempt>secretNumber){
    alert('You miss!! The secret number is lower than you attempt');
  }else if(attempt<secretNumber){
    alert('You miss!! The secret number is bigger than you attempt');
  }
}while(secretNumber!=attempt);