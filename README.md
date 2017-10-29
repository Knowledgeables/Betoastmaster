# Betoastmaster
两种弹窗的集合项目
   项目演示
   ![image](http://ocpo7eh90.bkt.clouddn.com/GIF.gif)
      
使用 方式
   
使用 方式

          

 -    case R.id.button0:
             Toast.makeText(this, "普通的弹窗", Toast.LENGTH_LONG).show();
                break;
 -          case R.id.button1:
                BeToastUtil.showDownToast(this, "toast显示download弹窗");
                
                break;
 -           case R.id.button2:
                BeToastUtil.showWaringToast(this, "toast显示warning弹窗");
                
                break;
 -           case R.id.button3:
                BeToastUtil.showErrorToast(this, "toast显示error弹窗");
                
                break;
 -           case R.id.button4:
                BeToastUtil.showInfoToast(this, "toast显示info弹窗");
                
                break;
 -            case R.id.button5:
                BeToastUtil.showDefaultToast(this, "toast显示default弹窗");
                break;
                
 -             case R.id.button6:
                BeToastUtil.showConfusionToast(this, "toast显示confusion弹窗");
                break;
                
 -            case R.id.button7:
                BeToastUtil.showCustomerSnaker(this, "toast显示自定义snaker弹窗");
                break;
                
 -             case R.id.button8:
                BeToastUtil.showSuccessSnaker(this, "toast显示success弹窗");
                break;
                
 -            case R.id.button9:
                BeToastUtil.showErrorSnaker(this, "toast显示faild弹窗");
                break;
                
 -            case R.id.button10:
                BeToastUtil.showInfoSnaker(this, "toast显示info弹窗");
                break;
