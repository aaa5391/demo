$(function () {                                                               
    $('#canvasDiv').highcharts({                                          
        chart: {    
			height:230
		   
        }, 
        colors: ['#dedede','#3596d5'],                                                         
        title: {                                                          
            text: ''                                     
        }, 
       credits:{
			enabled:false
			},
        xAxis: {         	
        	line: null,
        	gridLineColor: '#ffffff',  
        	title:{
				   enabled:false
				},
        	// max: 12,
			// maxRange: 5,
			// minRange: 5,                                                      
            categories: ["一月","二月","三月","四月","五月","六月","七月","八月","九月","十月"]
        },
		yAxis:{
				max: 160,
				// maxRange: 40,
				minRange: 50,
				gridLineColor: '#ffffff',
				title:{
				   enabled:false
				}
			},
        tooltip: {                                                        
            formatter: function() {                                       
                var s;                                                    
                                                                  
                s = ''+                                               
                        this.x  +': '+ this.y;                            
                                                                        
                return s;                                                 
            }                                                             
        },                                                                
        labels: {                                                         
            items: [{                                                     
                html: '',                          
                style: {                                                  
                    left: '40px',                                         
                    top: '8px',                                           
                    color: 'black'                                        
                }                                                         
            }]                                                            
        }, 
	    legend:{
			enabled:false
			},
        series: [{                                                        
            type: 'column',                                               
            name: '小屋子',                                                 
            data: [45,52,54,44,30,84,74,50,24,24,54,40,]                                         
        }, {                                                              
            type: 'line',                                               
            name: '扫荡',                                              
            data: [13,26,32,50,54,40,26,32,50,54,54,40,],                               
            marker: {                                                     
            	lineWidth: 0,                                               
            	lineColor: Highcharts.getOptions().colors[3],               
            	fillColor: '#6396D5'                                          
            }                                                             
        }]                                                                
    });                                                                   
});                                                                       				


